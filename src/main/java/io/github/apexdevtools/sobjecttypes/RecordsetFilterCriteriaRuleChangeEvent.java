/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class RecordsetFilterCriteriaRuleChangeEvent extends SObject {
	public static SObjectType$<RecordsetFilterCriteriaRuleChangeEvent> SObjectType;
	public static SObjectFields$<RecordsetFilterCriteriaRuleChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CriteriaField;
	public String CurrencyIsoCode;
	public String FirstOccurrence;
	public String Frequency;
	public Id Id;
	public Integer Index;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastOccurrence;
	public String NextOccurrenceField;
	public String Operator;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String RecordsetFilterCriteriaRuleNumber;
	public String ReplayId;
	public String Type;
	public String UsageRateField;
	public String UsageRateUnit;
	public String Value;

	public RecordsetFilterCriteriaRuleChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRuleChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
