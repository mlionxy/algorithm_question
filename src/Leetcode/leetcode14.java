class leetcode14 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
        {
            return "";
        }
        if (strs.length == 1)
        {
            return strs[0];
        }

        String ret = strs[0];
        for (String str : strs)
        {
            while (!str.startsWith(ret))
            {
                ret = ret.substring(0, ret.length() - 1);
            }
        }
        return ret;
    }

}