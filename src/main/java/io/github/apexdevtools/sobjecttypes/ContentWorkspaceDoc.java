/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class ContentWorkspaceDoc extends SObject {
	public static SObjectType$<ContentWorkspaceDoc> SObjectType;
	public static SObjectFields$<ContentWorkspaceDoc> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id ContentWorkspaceId;
	public ContentWorkspace ContentWorkspace;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOwner;
	public Datetime SystemModstamp;

	public ContentWorkspaceDoc clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentWorkspaceDoc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
