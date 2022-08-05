package com.agrunskii.uploading_files.storage

import org.springframework.core.io.Resource
import org.springframework.stereotype.Repository
import org.springframework.web.multipart.MultipartFile

import java.nio.file.Path
import java.util.stream.Stream

@Repository
interface StorageService {
    fun init()

    fun store(file: MultipartFile)

    fun loadAll(): Stream<Path>

    fun load(filename: String): Path

    fun loadAsResource(filename: String): Resource

    fun deleteAll()
}