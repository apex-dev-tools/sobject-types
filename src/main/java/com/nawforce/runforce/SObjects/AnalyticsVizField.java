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
public class AnalyticsVizField extends SObject {
	public static SObjectType$<AnalyticsVizField> SObjectType;
	public static SObjectFields$<AnalyticsVizField> Fields;

	public String AdHocCalc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DisplayCategory;
	public String FieldKey;
	public String Function;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Role;
	public String SemanticFieldApiName;
	public String SemanticObjectApiName;
	public Datetime SystemModstamp;
	public String Type;
	public String UniqueIndex;
	public Id VisualizationId;
	public AnalyticsVisualization Visualization;

	public AnalyticsVizField clone$() {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizField clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizField clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AnalyticsVizField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
