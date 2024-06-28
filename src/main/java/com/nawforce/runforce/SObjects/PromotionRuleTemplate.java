/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

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
