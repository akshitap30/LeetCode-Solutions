class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length % groupSize != 0) {
            return false;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int card : hand) {
            freq.put(card, freq.getOrDefault(card, 0) + 1);
        }

        Arrays.sort(hand);

        
        for (int i = 0; i < hand.length; i++) {

            int card = hand[i];

        
            if (freq.get(card) == 0) {
                continue;
            }

            for (int j = 0; j < groupSize; j++) {

                int current = card + j;

                if (!freq.containsKey(current) || freq.get(current) == 0) {
                    return false;
                }

                freq.put(current, freq.get(current) - 1);
            }
        }

        return true;
    }
}