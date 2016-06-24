package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = ConstantManager.TAG_PREFIX + "Main Activity";

    /**
     * метод вызывается при создании активити (после изменения конфигурации, возврата к
     * текущей активности, после уничтожения).
     *
     * в данном методе инициализируются/производятся:
     * - UI
     * - инициализация статич. данных активити
     * - связь данных со списками (инициализация адаптеров)
     *
     * НЕ запускать длительные операции по работе с данными в onCreate
     *
     * @param savedInstanceState - объект со значениями данных в Bundle - состояние UI
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d (TAG, "onCreate");

    }

    /**
     * метод вызывается при старте активити, до того как UI станет доступным пользователю
     * как правило в данном методе происходит регистрация подписки на события, остановка которых
     * была произведена в onStop
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d (TAG, "onStart");
    }

    /**
     * метод вызывается, когда активити становится доступна пользователю для взаимодействия
     * происходит запуск анимаций/видео/аудио, запуск бродкаст ресивера, которые необходимы для
     * реализации UI логики, запуск выполнения потоков и т. д.
     * метод должен быть легковесным для макс. отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d (TAG, "onResume");
    }

    /**
     * метод вызывается, когда текущая активити теряет фокус, но остается видимой (всплытие
     * диалогового окна и т.п.)
     * в данном методе должна сохраняться легковесность UI
     */
        @Override
    protected void onPause() {
        super.onPause();
        Log.d (TAG, "onPause");
    }

    /**
     * вызывается, когда активити становится невидимым для пользователя
     * в данном методе происходит отписка от сложных событий (остановка анимаций, сохранения
     * данных, прерываются запущенные потоки и т.д).
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d (TAG, "onStop");
    }

    /**
     * метод вызывается при окончании работы активити (системно или вызовом метода finish)
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d (TAG, "onDestroy");
    }

    /**
     * Метод вызывается при рестарте активити/возобнавлении работы после вызова метода onStop()
     * в данном методе реализуется спецификация бизнес логики которая должна быть реализована именно
     * при рестарте активности - например запрос к серверу который необходимо вызвать при возвращении
     * из другой активности (обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/специфическая бизнес логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d (TAG, "onRestart");
    }

}
