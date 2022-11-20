package com.meleshkomd.shoppinglist.domain

class GetShopItemUseCse(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}