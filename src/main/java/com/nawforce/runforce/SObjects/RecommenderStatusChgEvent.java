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
