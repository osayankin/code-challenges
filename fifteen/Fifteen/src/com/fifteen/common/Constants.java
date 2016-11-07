package com.fifteen.common;

public interface Constants {
  int MENU_ITEM_POSITION_START_GAME = 0;
  int MENU_ITEM_POSITION_ABOUT = 1;
  int MENU_ITEM_POSITION_SETTINGS = 2;
  int MENU_ITEM_POSITION_EXIT = 3;
  int MENU_ITEM_POSITION_GAME_TYPE = 0;
  int MENU_ITEM_POSITION_GAME_TYPE_CLASSIC = 0;
  int MENU_ITEM_POSITION_GAME_TYPE_IMAGE = 1;
  int MENU_ITEM_ID_NEW_GAME = 0;
  int MENU_ITEM_ID_BACK_TO_MENU = 1;
  int MENU_ITEM_ID_CLASSIC_GAME = 0;
  int MENU_ITEM_ID_IMAGE_GAME = 1;
  int DIALOG_ID_ABOUT = 0;
  int DIALOG_ID_GAME_TYPE = 0;
  int NUMBER_OF_CELLS_X = 4;
  int NUMBER_OF_CELLS_Y = 4;
  int TOTAL_NUMBER_OF_CELLS = NUMBER_OF_CELLS_X * NUMBER_OF_CELLS_Y;
  int NUMBER_OF_STEPS_TO_MIX_CELLS = 10000;
  int LAST_CELL_COORDINATE_X = NUMBER_OF_CELLS_X - 1;
  int LAST_CELL_COORDINATE_Y = NUMBER_OF_CELLS_Y - 1;
  String GAME_TYPE = "game_type";
  int GAME_TYPE_CLASSIC_GAME = 0;
  int GAME_TYPE_IMAGE_GAME = 1;
}
