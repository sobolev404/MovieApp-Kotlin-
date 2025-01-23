package com.piashcse.hilt_mvvm_compose_movie.data.repository.remote.tvseries

import androidx.paging.PagingData
import com.piashcse.hilt_mvvm_compose_movie.data.model.SearchBaseModel
import com.piashcse.hilt_mvvm_compose_movie.data.model.TvSeriesItem
import com.piashcse.hilt_mvvm_compose_movie.data.model.artist.Artist
import com.piashcse.hilt_mvvm_compose_movie.data.model.tv_series_detail.TvSeriesDetail
import com.piashcse.hilt_mvvm_compose_movie.utils.network.DataState
import kotlinx.coroutines.flow.Flow

interface TvSeriesRepositoryInterFace {
    fun airingTodayTvSeriesPagingDataSource(genreId: String?): Flow<PagingData<TvSeriesItem>>
    fun onTheAirTvSeriesPagingDataSource(genreId: String?): Flow<PagingData<TvSeriesItem>>
    fun popularTvSeriesPagingDataSource(genreId: String?): Flow<PagingData<TvSeriesItem>>
    fun topRatedTvSeriesPagingDataSource(genreId: String?): Flow<PagingData<TvSeriesItem>>
    suspend fun searchTvSeries(searchKey: String): Flow<DataState<SearchBaseModel>>
    suspend fun tvSeriesDetail(seriesId: Int): Flow<DataState<TvSeriesDetail>>
    suspend fun recommendedTvSeries(seriesId: Int): Flow<DataState<List<TvSeriesItem>>>
    suspend fun artistDetail(personId: Int): Flow<DataState<Artist>>
}