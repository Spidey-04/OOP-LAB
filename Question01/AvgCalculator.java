package com.mycompany.labsheet6;

public class AvgCalculator {   
        private int TotalMarks;
        private int NoOfStudents;
        
        public AvgCalculator(int TotalMarks, int NoOfstudents){
            this.TotalMarks = TotalMarks;
            this.NoOfStudents = NoOfStudents;
        }
        
        public int calculate_average() {
            return TotalMarks/NoOfStudents;
        }
} 
