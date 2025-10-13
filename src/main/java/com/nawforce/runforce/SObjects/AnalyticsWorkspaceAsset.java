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
public class AnalyticsWorkspaceAsset extends SObject {
	public static SObjectType$<AnalyticsWorkspaceAsset> SObjectType;
	public static SObjectFields$<AnalyticsWorkspaceAsset> Fields;

	public Id ActivePromotionRequestId;
	public DataAssetPromotionRequest ActivePromotionRequest;
	public Id AnalyticsWorkspaceId;
	public AnalyticsWorkspace AnalyticsWorkspace;
	public Id AssetId;
	public Name Asset;
	public String AssetType;
	public String AssetUsageType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String HistoricalPromotionStatus;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MetadataSourceType;
	public Datetime SystemModstamp;

	public AnalyticsWorkspaceAsset clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsWorkspaceAsset clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsWorkspaceAsset clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsWorkspaceAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsWorkspaceAsset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
