package com.jd.ut.junit.util;




import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class DateTimeUtil {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String formatDate(Date date, String format) {
        if (StringUtils.isEmpty(format)) {
            format = DATE_TIME_FORMAT;
        }
        if (date == null) {
            throw new RuntimeException();
        }
        return new SimpleDateFormat(format).format(date);
    }

    public static String dateToString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

    private class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;
    }

    private List<TreeNode> list;

    public TreeNode iteraterTreeNode(TreeNode node){
        if(node == null) return null;
        if(null != node.right){
            iteraterTreeNode(node.right);
        }
        return node;
    }

    private LinkedList<TreeNode> list2 = new LinkedList<>();
    public TreeNode iteraterTreeNode2(TreeNode node){
        if(node == null) return null;
        list2.add(node);
        if(null != node.right){
            iteraterTreeNode(node.right);
        } else {
            list2.remove();
            iteraterTreeNode(list2.getLast().left);
        }
        return node;

    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(s.charAt(3));
    }



}
