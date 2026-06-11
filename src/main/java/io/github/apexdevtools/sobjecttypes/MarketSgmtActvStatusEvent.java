/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MarketSgmtActvStatusEvent extends SObject {
	public static SObjectType$<MarketSgmtActvStatusEvent> SObjectType;
	public static SObjectFields$<MarketSgmtActvStatusEvent> Fields;

	public String ActivationId;
	public Datetime AudienceDmoLastRunTimestamp;
	public String AudienceDmoLatestName;
	public String AudienceDmoName;
	public String AudienceDmoRecordSchema;
	public Datetime CdpEventPublishDate;
	public String CdpEventType;
	public String CdpSchemaVersion;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDate;
	public String EventUuid;
	public Datetime LastPublishDate;
	public String LastPublishStatus;
	public String LastPublishStatusErrorMessage;
	public Long RecordCount;
	public String ReplayId;
	public Boolean ShouldReSync;

	public MarketSgmtActvStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MarketSgmtActvStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MarketSgmtActvStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MarketSgmtActvStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MarketSgmtActvStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
