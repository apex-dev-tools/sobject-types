/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GameRewardChangeEvent extends SObject {
	public static SObjectType$<GameRewardChangeEvent> SObjectType;
	public static SObjectFields$<GameRewardChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Color;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Integer CurrentRewardCount;
	public String Description;
	public Id GameDefinitionId;
	public GameDefinition GameDefinition;
	public Id Id;
	public String ImageUrl;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaximumRewardCount;
	public String Name;
	public String ReplayId;
	public Id RewardDefinitionId;
	public SObject RewardDefinition;
	public String RewardType;
	public Decimal RewardValue;
	public Decimal WinProbability;

	public GameRewardChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GameRewardChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GameRewardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GameRewardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GameRewardChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
