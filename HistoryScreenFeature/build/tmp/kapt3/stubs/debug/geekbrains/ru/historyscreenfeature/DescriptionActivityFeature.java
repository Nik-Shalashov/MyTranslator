package geekbrains.ru.historyscreenfeature;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u00a8\u0006\u0016"}, d2 = {"Lgeekbrains/ru/historyscreenfeature/DescriptionActivityFeature;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setActionbarHomeButtonAsUp", "setData", "startLoadingOrShowError", "stopRefreshAnimationIfNeeded", "useGlideToLoadPhoto", "imageView", "Landroid/widget/ImageView;", "imageLink", "", "usePicassoToLoadPhoto", "Companion", "HistoryScreenFeature_debug"})
public final class DescriptionActivityFeature extends androidx.appcompat.app.AppCompatActivity {
    private static final java.lang.String DIALOG_FRAGMENT_TAG = "8c7dff51-9769-4f6d-bbee-a3896085e76e";
    private static final java.lang.String WORD_EXTRA = "f76a288a-5dcc-43f1-ba89-7fe1d53f63b0";
    private static final java.lang.String DESCRIPTION_EXTRA = "0eeb92aa-520b-4fd1-bb4b-027fbf963d9a";
    private static final java.lang.String URL_EXTRA = "6e4b154d-e01f-4953-a404-639fb3bf7281";
    public static final geekbrains.ru.historyscreenfeature.DescriptionActivityFeature.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setActionbarHomeButtonAsUp() {
    }
    
    private final void setData() {
    }
    
    private final void startLoadingOrShowError() {
    }
    
    private final void stopRefreshAnimationIfNeeded() {
    }
    
    private final void usePicassoToLoadPhoto(android.widget.ImageView imageView, java.lang.String imageLink) {
    }
    
    private final void useGlideToLoadPhoto(android.widget.ImageView imageView, java.lang.String imageLink) {
    }
    
    public DescriptionActivityFeature() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lgeekbrains/ru/historyscreenfeature/DescriptionActivityFeature$Companion;", "", "()V", "DESCRIPTION_EXTRA", "", "DIALOG_FRAGMENT_TAG", "URL_EXTRA", "WORD_EXTRA", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "word", "description", "url", "HistoryScreenFeature_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String word, @org.jetbrains.annotations.NotNull()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}