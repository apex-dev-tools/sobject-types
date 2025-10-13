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
public class AnalyticsVizViewDef extends SObject {
	public static SObjectType$<AnalyticsVizViewDef> SObjectType;
	public static SObjectFields$<AnalyticsVizViewDef> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOriginal;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id OwnerId;
	public User Owner;
	public Datetime SystemModstamp;
	public Decimal Version;
	public Id VisualizationId;
	public AnalyticsVisualization Visualization;

	public AnalyticsVizViewDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizViewDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizViewDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizViewDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizViewDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
