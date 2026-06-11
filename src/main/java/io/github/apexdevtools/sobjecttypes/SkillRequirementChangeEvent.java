/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SkillRequirementChangeEvent extends SObject {
	public static SObjectType$<SkillRequirementChangeEvent> SObjectType;
	public static SObjectFields$<SkillRequirementChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String ReplayId;
	public Id SkillId;
	public Skill Skill;
	public Decimal SkillLevel;
	public String SkillNumber;
	public Integer SkillPriority;

	public SkillRequirementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SkillRequirementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SkillRequirementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SkillRequirementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SkillRequirementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
