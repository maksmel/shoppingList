package com.meleshkomd.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopList(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>
}