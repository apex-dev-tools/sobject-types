/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class RecommenderStatusChgEvent extends SObject {
	public static SObjectType$<RecommenderStatusChgEvent> SObjectType;
	public static SObjectFields$<RecommenderStatusChgEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public Datetime EventPublishTime;
	public String EventUuid;
	public String JobVersion;
	public Datetime LastSuccessfulRefresh;
	public String LatestRefreshedStatus;
	public String RecommenderIdentifier;
	public Datetime RefreshComplete;
	public Datetime RefreshStart;
	public String ReplayId;

	public RecommenderStatusChgEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecommenderStatusChgEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecommenderStatusChgEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecommenderStatusChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecommenderStatusChgEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
