public class Solution {
    public int addDigits(int num) {
        int _num = num / 10 + num % 10;
        if(_num < 10){
            return _num;
        } else {
            return addDigits(_num);
        }
    }
}
