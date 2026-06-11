/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class PromotionRuleTemplate extends SObject {
	public static SObjectType$<PromotionRuleTemplate> SObjectType;
	public static SObjectFields$<PromotionRuleTemplate> Fields;

	public String ApiName;
	public String Category;
	public String Description;
	public String ExternalId;
	public String IconUrl;
	public Id Id;
	public Id JournalTypeId;
	public JournalType JournalType;
	public String Label;
	public String RuleConfiguration;
	public String RuleRewardConfiguration;

	public PromotionRuleTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionRuleTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionRuleTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionRuleTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionRuleTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
