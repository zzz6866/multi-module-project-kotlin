package kr.co.alldev.pickstock.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val mbrId: Long = 0
    private val mbrNm: String? = null
    private val mbrEmail: String? = null
}