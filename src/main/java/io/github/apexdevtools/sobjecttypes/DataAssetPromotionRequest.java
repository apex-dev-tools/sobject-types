/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DataAssetPromotionRequest extends SObject {
	public static SObjectType$<DataAssetPromotionRequest> SObjectType;
	public static SObjectFields$<DataAssetPromotionRequest> Fields;

	public Id AcknowledgedById;
	public User AcknowledgedBy;
	public Datetime AcknowledgedDate;
	public String Asset;
	public String AssetLabel;
	public Id CancelledById;
	public User CancelledBy;
	public Datetime CancelledDate;
	public Id CompletedById;
	public User CompletedBy;
	public Datetime CompletedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Datetime FailedDate;
	public Id Id;
	public Datetime InstalledDate;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Datetime MigrationSucceededDate;
	public String NamespacePrefix;
	public Integer NumberOfDependencies;
	public String PersonalOrg;
	public String PersonalOrgWorkspace;
	public String ProductionOrg;
	public String ProductionOrgWorkspace;
	public String RejectionComment;
	public Id RequestedById;
	public User RequestedBy;
	public Datetime RequestedDate;
	public String RequesterComment;
	public String SourceRequest;
	public String Status;
	public Datetime SystemModstamp;
	public String TargetAsset;
	public String TargetRequest;
	public String TaskType;
	public Id WorkspaceAssetId;
	public AnalyticsWorkspaceAsset WorkspaceAsset;

	public DataAssetPromotionRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataAssetPromotionRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataAssetPromotionRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataAssetPromotionRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataAssetPromotionRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
