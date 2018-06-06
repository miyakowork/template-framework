package me.wuwenbin.modules.validate.support;

/**
 * 数学的区间类
 * created by Wuwenbin on 2018/6/6 at 10:00
 *
 * @author wuwenbin
 */
public class Interval<T> {
    /**
     * 区间下界限定值
     */
    private BorderInterval<T> left;

    /**
     * 区间上界限定值
     */
    private BorderInterval<T> right;

    public BorderInterval<T> getLeft() {
        return left;
    }

    public void setLeft(BorderInterval<T> left) {
        this.left = left;
    }

    public BorderInterval<T> getRight() {
        return right;
    }

    public void setRight(BorderInterval<T> right) {
        this.right = right;
    }

    /**
     * 区间的状态
     */
    public enum Status {
        /**
         * 开区间
         */
        OPEN,

        /**
         * 闭区间
         */
        CLOSE
    }

    public class BorderInterval<T> {
        private Status status;
        private T value;

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
