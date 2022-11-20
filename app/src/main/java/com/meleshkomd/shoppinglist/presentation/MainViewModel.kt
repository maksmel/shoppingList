package com.meleshkomd.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.meleshkomd.shoppinglist.data.ShopListRepositoryImpl
import com.meleshkomd.shoppinglist.domain.DeleteShopItemUseCase
import com.meleshkomd.shoppinglist.domain.EditShopItemUseCase
import com.meleshkomd.shoppinglist.domain.GetShopListUseCase
import com.meleshkomd.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val shopListRepository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(shopListRepository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(shopListRepository)
    private val editShopItemUseCase = EditShopItemUseCase(shopListRepository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }

}