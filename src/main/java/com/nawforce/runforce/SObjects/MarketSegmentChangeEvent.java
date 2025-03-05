/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MarketSegmentChangeEvent extends SObject {
	public static SObjectType$<MarketSegmentChangeEvent> SObjectType;
	public static SObjectFields$<MarketSegmentChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataGraphId;
	public DataGraph DataGraph;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String ExcludeCriteria;
	public Id Id;
	public String IncludeCriteria;
	public Boolean IsCurrentSaveApproxCount;
	public Boolean IsPrevSaveApproxCount;
	public Boolean IsSeedSegment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishStatusDateTime;
	public String LastPublishStatusErrorCode;
	public Datetime LastPublishedEndDateTime;
	public Datetime LastSeedModelRunDateTime;
	public Datetime LastSeedModelStatusDateTime;
	public String LastSeedModelStatusErrorCode;
	public Datetime LastSegmentCountEndDateTime;
	public Long LastSegmentExcludedCount;
	public Long LastSegmentExcludedCountError;
	public Long LastSegmentIncludedCount;
	public Long LastSegmentMemberCount;
	public Long LastSegmentMemberCountError;
	public Long LastSegmentRemainderCount;
	public Datetime LastSegmentStatusDateTime;
	public String LastSegmentStatusErrorCode;
	public String LastSegmentStatusErrorDetails;
	public Long LastSegmentTotalCount;
	public String LookbackPeriod;
	public String Name;
	public Datetime NextPublishDateTime;
	public Date PublishScheduleEndDate;
	public Datetime PublishScheduleEndDateTime;
	public String PublishScheduleInterval;
	public Datetime PublishScheduleStartDateTime;
	public String PublishStatus;
	public String PublishType;
	public String ReplayId;
	public String SeedModelStatus;
	public String SeedSimilarity;
	public Long SeedSimilarityHighToMedium;
	public Long SeedSimilarityMediumToLow;
	public String SegmentMembershipDataModelList;
	public String SegmentMembershipTable;
	public String SegmentStatus;

	public MarketSegmentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
