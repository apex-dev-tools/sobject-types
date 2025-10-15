/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SpecimenChangeEvent extends SObject {
	public static SObjectType$<SpecimenChangeEvent> SObjectType;
	public static SObjectFields$<SpecimenChangeEvent> Fields;

	public Id BodySiteId;
	public CodeSet BodySite;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public Id CollectionDeviceCodeId;
	public CodeSet CollectionDeviceCode;
	public Decimal CollectionDuration;
	public Id CollectionDurationUomId;
	public UnitOfMeasure CollectionDurationUom;
	public Datetime CollectionEndDate;
	public Id CollectionMethodCodeId;
	public CodeSet CollectionMethodCode;
	public Decimal CollectionQuantity;
	public Id CollectionQuantityUomId;
	public UnitOfMeasure CollectionQuantityUom;
	public Datetime CollectionStartDate;
	public Id CollectorId;
	public SObject Collector;
	public Id ConditionCodeId;
	public CodeSetBundle ConditionCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal FastingDuration;
	public Id FastingDurationUomId;
	public UnitOfMeasure FastingDurationUom;
	public Id FastingStatusCodeId;
	public CodeSet FastingStatusCode;
	public Id FeatureCodeId;
	public CodeSetBundle FeatureCode;
	public String GroupingMethod;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Datetime ReceivedDate;
	public String ReplayId;
	public Id SourceReferenceRecordId;
	public SObject SourceReferenceRecord;
	public String Status;
	public Id TypeId;
	public CodeSet Type;
	public Id UsageCodeId;
	public CodeSetBundle UsageCode;

	public SpecimenChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SpecimenChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SpecimenChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SpecimenChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SpecimenChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
