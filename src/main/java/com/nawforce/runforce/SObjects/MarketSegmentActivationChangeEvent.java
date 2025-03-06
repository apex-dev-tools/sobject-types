/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MarketSegmentActivationChangeEvent extends SObject {
	public static SObjectType$<MarketSegmentActivationChangeEvent> SObjectType;
	public static SObjectFields$<MarketSegmentActivationChangeEvent> Fields;

	public String ActivationFlowType;
	public String ActivationObjectFilter;
	public String ActivationObjectName;
	public String ActivationObjectPath;
	public String ActivationRefreshType;
	public String ActivationStatus;
	public Id ActivationTargetId;
	public ActivationTarget ActivationTarget;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CuratedEntityName;
	public String CurrencyIsoCode;
	public String CustomerFileSource;
	public String DataGraphName;
	public String DataGraphPath;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DirectAttributeDmoFilterExpression;
	public String DmoFilterExpression;
	public Datetime EndDate;
	public Id Id;
	public Datetime LastActivationStatusDateTime;
	public String LastActivationStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastPublishStatus;
	public String LastPublishStatusErrorMessage;
	public Datetime LastPublishedDate;
	public Integer LimitValue;
	public String LimitingAttributesExpression;
	public Id MarketSegmentId;
	public MarketSegment MarketSegment;
	public String Name;
	public Long RecordCount;
	public String ReplayId;
	public Datetime StartDate;
	public String StaticAttributes;

	public MarketSegmentActivationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentActivationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
