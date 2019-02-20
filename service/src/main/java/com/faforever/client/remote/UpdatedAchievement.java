package com.faforever.client.remote;

import org.jetbrains.annotations.Nullable;
import org.supcomhub.api.dto.AchievementState;

public class UpdatedAchievement {

  private String achievementId;
  private AchievementState currentState;
  private Integer currentSteps;
  private boolean newlyUnlocked;

  public String getAchievementId() {
    return achievementId;
  }

  public void setAchievementId(String achievementId) {
    this.achievementId = achievementId;
  }

  public AchievementState getCurrentState() {
    return currentState;
  }

  public void setCurrentState(AchievementState currentState) {
    this.currentState = currentState;
  }

  @Nullable
  public Integer getCurrentSteps() {
    return currentSteps;
  }

  public void setCurrentSteps(@Nullable Integer currentSteps) {
    this.currentSteps = currentSteps;
  }

  public boolean getNewlyUnlocked() {
    return newlyUnlocked;
  }

  public void setNewlyUnlocked(boolean newlyUnlocked) {
    this.newlyUnlocked = newlyUnlocked;
  }
}
