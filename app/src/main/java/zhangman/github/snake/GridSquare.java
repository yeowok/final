package zhangman.github.snake;

import android.graphics.Color;


public class GridSquare {
  private int mType;//元素類型

  public GridSquare(int type) {
    mType = type;
  }

  public int getColor() {
    switch (mType) {
      case GameType.GRID://空格子
        return Color.WHITE;
      case GameType.FOOD://食物
        return Color.GREEN;
      case GameType.SNAKE://蛇
        return Color.parseColor("#FF0088");
    }
    return Color.WHITE;
  }

  public void setType(int type) {
    mType = type;
  }
}
