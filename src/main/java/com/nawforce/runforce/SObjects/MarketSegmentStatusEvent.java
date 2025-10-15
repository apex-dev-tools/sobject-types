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
public class MarketSegmentStatusEvent extends SObject {
	public static SObjectType$<MarketSegmentStatusEvent> SObjectType;
	public static SObjectFields$<MarketSegmentStatusEvent> Fields;

	public Datetime CdpEventPublishDate;
	public String CdpEventType;
	public String CdpSchemaVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDate;
	public String EventUuid;
	public Boolean IsActive;
	public Boolean IsSyncRequired;
	public Datetime LastPublishedEndDateTime;
	public Datetime LastSeedModelStatusDateTime;
	public String LastSeedModelStatusErrorCode;
	public Datetime LastSeedModelStatusRunDateTime;
	public Long LastSegmentExcludedCount;
	public Long LastSegmentExcludedCountAbsoluteError;
	public Long LastSegmentIncludedCount;
	public Long LastSegmentMemberCount;
	public Long LastSegmentMemberCountAbsoluteError;
	public Long LastSegmentRemainderCount;
	public Datetime LastSegmentStatusDateTime;
	public String LastSegmentStatusErrorCode;
	public String LastSegmentStatusErrorDetails;
	public Long LastSegmentTotalCount;
	public Datetime NextPublishDateTime;
	public String PreviewSimilarJobStats;
	public String ReplayId;
	public String SeedModelStatus;
	public Long SeedSimilarityHighToMedium;
	public Long SeedSimilarityMediumToLow;
	public String SegmentId;
	public String SegmentJobStatus;
	public String SegmentJobType;
	public String SegmentMembershipTable;
	public String SyncField;
	public String WaterfallSegmentStats;

	public MarketSegmentStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MarketSegmentStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
