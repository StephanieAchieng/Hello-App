package layout

data class Student {
    @SerializeName(value: "student_id")var studentId: String,
    @SerializeName(value: "first_name")var firstName: String,
    @SerializeName(value: "last_name")var lastName: String,
    @SerializeName(value: "email")var email: String,
    @SerializeName(value: "phone_number")var phoneNumber: String,
    @SerializeName(value: "image_url")var imageUrl: String,

}