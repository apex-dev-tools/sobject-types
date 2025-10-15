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
public class AnalyticsVisualization extends SObject {
	public static SObjectType$<AnalyticsVisualization> SObjectType;
	public static SObjectFields$<AnalyticsVisualization> Fields;

	public Id AnalyticsWorkspaceId;
	public AnalyticsWorkspace AnalyticsWorkspace;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Datetime LastDraftModifiedDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastPublishedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public Datetime SystemModstamp;
	public String TemplateAssetSourceName;
	public String TemplateSource;
	public Decimal Version;

	public AnalyticsWorkspaceAsset[] AnalyticsWorkspaces;

	public AnalyticsVisualization clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVisualization clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVisualization clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVisualization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVisualization clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
