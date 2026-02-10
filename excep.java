class ExamLoginException extends Exception {
    ExamLoginException(String msg) {
        super(msg);
    }
}
class OnlineExam {
    static void startExam(String hallTicket) throws ExamLoginException {
        if (hallTicket == null || hallTicket.isEmpty()) {
            throw new ExamLoginException("Hall Ticket number required to start exam");
        }
        System.out.println("Exam started successfully");
    }
    public static void main(String[] args) {
        try {
            startExam("");   
        } catch (ExamLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
