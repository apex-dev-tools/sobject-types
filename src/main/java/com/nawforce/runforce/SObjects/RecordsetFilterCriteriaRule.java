/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RecordsetFilterCriteriaRule extends SObject {
	public static SObjectType$<RecordsetFilterCriteriaRule> SObjectType;
	public static SObjectFields$<RecordsetFilterCriteriaRule> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CriteriaField;
	public String CurrencyIsoCode;
	public String FirstOccurrence;
	public String Frequency;
	public Id Id;
	public Integer Index;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastOccurrence;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String NextOccurrenceField;
	public String Operator;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String RecordsetFilterCriteriaRuleNumber;
	public Datetime SystemModstamp;
	public String Type;
	public String UsageRateField;
	public String UsageRateUnit;
	public String Value;

	public RecordsetFilterCriteriaRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecordsetFilterCriteriaRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
