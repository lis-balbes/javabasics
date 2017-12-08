package com.javabasics;

public final class ComplexNumber {

        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object object) {
            if(this == object) return true;
            if(object == null) return false;
            if(this.getClass() != object.getClass()) return false;

            ComplexNumber other = (ComplexNumber) object;

            if(other.im == this.im & other.re == this.re) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public int hashCode() {
            int coeff = 4;
            int result = Double.hashCode(re) + Double.hashCode(im) * coeff;
            return result;
        }
}
