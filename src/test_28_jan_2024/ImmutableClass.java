package test_28_jan_2024;

    public final class ImmutableClass {
        // Declare private final fields
        private final String immutableField1;
        private final int immutableField2;

        // Constructor to initialize the immutable fields
        public ImmutableClass(String field1, int field2) {
            this.immutableField1 = field1;
            this.immutableField2 = field2;
        }

        // Getter methods to access the immutable fields
        public String getImmutableField1() {
            return immutableField1;
        }

        public int getImmutableField2() {
            return immutableField2;
        }
    }

