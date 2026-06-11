/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ContentVersionComment extends SObject {
	public static SObjectType$<ContentVersionComment> SObjectType;
	public static SObjectFields$<ContentVersionComment> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id ContentVersionId;
	public ContentVersion ContentVersion;
	public Datetime CreatedDate;
	public Id Id;
	public String UserComment;

	public ContentVersionComment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentVersionComment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
