/*package com.dina.todotogether.util;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@Component
public class S3UploadImage {

    @Autowired
    private final AmazonS3 amazonS3;

    @Value("{cloud.aws.s3.bucket}")
    private String bucket;

    public String upload(MultipartFile file, String fileName) throws IOException {

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType(file.getContentType());

        amazonS3.putObject(new PutObjectRequest(bucket, fileName, file.getInputStream(), null )
                .withCannedAcl(CannedAccessControlList.PublicRead));
        return amazonS3.getUrl(bucket, fileName).toString();
    }
}*/
