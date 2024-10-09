public class Student {

        private String fullname;
        private String projectAssignment;
        private String teacherSupervisor;
        private boolean submitted;


        public Student(String fullname, String projectAssignment, String teacherSupervisor, boolean submitted) {
            this.fullname = fullname;
            this.projectAssignment = projectAssignment;
            this.teacherSupervisor = teacherSupervisor;
            this.submitted = submitted;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getProjectAssignment() {
            return projectAssignment;
        }

        public void setProjectAssignment(String projectAssignment) {
            this.projectAssignment = projectAssignment;
        }

        public String getTeacherSupervisor() {
            return teacherSupervisor;
        }

        public void setTeacherSupervisor(String teacherSupervisor) {
            this.teacherSupervisor = teacherSupervisor;
        }

        public boolean isSubmitted() {
            return submitted;
        }

        public void setSubmitted(boolean submitted) {
            this.submitted = submitted;
        }
    }


