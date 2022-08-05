package com.agrunskii.uploading_files

import org.springframework.stereotype.Controller
import kotlin.reflect.jvm.internal.impl.storage.StorageManager

@Controller
class FileUploadController {
    private val storageService: StorageManager

    constructor(storageService: StorageManager) {
        this.storageService = storageService
    }


}