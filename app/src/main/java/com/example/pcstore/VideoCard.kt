package com.example.pcstore
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class VideoCard(
    val photoId: Int,
    val model: String,
    val price: Double,
    val memory: Int,
    val memoryType: String,
    val interfaceType: String,
    val gpuManufacturer: String,
    val description: String,
    val descriptionLong: String,
):Parcelable

fun createVideoCard(): List<VideoCard> {
    return listOf(
        VideoCard(
            R.drawable.asus,
            "Asus RTX 3060 TUF Gaming",
            20000.0,
            12,
            "GDDR6",
            "PCI-Express x16 4.0",
            "nVidia",
            "12GB GDDR6 (2 x HDMI, 3 x DisplayPort)",
            "Відеокарти серії GeForce RTX 30 підходять " +
                    "не лише для ігор, але й для продуктивної роботи. Підтримка технологій " +
                    "штучного інтелекту, сумісність із програмною платформою NVIDIA Studio і висока " +
                    "продуктивність роблять їх чудовим вибором для тривимірного моделювання, редагування " +
                    "відеоматеріалів у форматі 8K або стримінга в прямому ефірі.",


        ),
        VideoCard(
            R.drawable.msi,
            "MSI GeForce RTX 3050 Aero ",
            12049.0,
            8,
            "GDDR6",
            "PCI-Express x16 4.0",
            "AMD",
            "8GB GDDR6 (HDMI, 3 x DisplayPort) ",
            "Відеокарти серії GeForce RTX 30 підходять " +
                    "не лише для ігор, але й для продуктивної роботи. Підтримка технологій " +
                    "штучного інтелекту, сумісність із програмною платформою NVIDIA Studio і висока " +
                    "продуктивність роблять їх чудовим вибором для тривимірного моделювання, редагування " +
                    "відеоматеріалів у форматі 8K або стримінга в прямому ефірі.",

        ),
        VideoCard(
            R.drawable.gigabyte,
            "Gigabyte GeForce RTX 3060 Gaming",
            17500.0,
            12,
            "GDDR6",
            "PCI-Express x16 4.0",
            "nVidia",
            "12GB GDDR6 (2 х HDMI, 2 x DisplayPort)",
            "Відеокарти серії GeForce RTX 30 підходять не лише для ігор, але й для " +
                    "продуктивної роботи. Підтримка технологій штучного інтелекту, сумісність із " +
                    "програмною платформою NVIDIA Studio і висока продуктивність роблять їх чудовим " +
                    "вибором для тривимірного моделювання, редагування відеоматеріалів у форматі 8K " +
                    "або стримінга в прямому ефірі.",

        )
    )



}