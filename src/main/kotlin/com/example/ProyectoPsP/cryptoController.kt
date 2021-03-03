package com.example.ProyectoPsP

import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.util.*
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

class cryptoController {
    companion object {
        fun encriptacion(textoEnString: String, llaveEnString: String): String {
            val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
            cipher.init(Cipher.ENCRYPT_MODE, getKey(llaveEnString))
            return URLEncoder.encode(
                Base64.getEncoder().encodeToString(cipher.doFinal(textoEnString.toByteArray(Charsets.UTF_8))),
                StandardCharsets.UTF_8)
        }

        fun desencriptacion(textoCifrado: String, llaveEnString: String): String {
            val cipher = Cipher.getInstance("AES/ECB/PKCS5Padding")
            cipher.init(Cipher.DECRYPT_MODE, getKey(llaveEnString))
            return String(cipher.doFinal(Base64.getDecoder().decode(textoCifrado)))
        }

        fun getKey(llaveEnString: String): SecretKeySpec {
            var llaveUtf8 = llaveEnString.toByteArray(Charsets.UTF_8)
            val sha = MessageDigest.getInstance("SHA-1")
            llaveUtf8 = sha.digest(llaveUtf8)
            llaveUtf8 = llaveUtf8.copyOf(16)
            return SecretKeySpec(llaveUtf8, "AES")
        }
    }
}