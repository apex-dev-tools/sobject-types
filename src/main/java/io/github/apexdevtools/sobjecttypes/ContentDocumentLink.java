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
public class ContentDocumentLink extends SObject {
	public static SObjectType$<ContentDocumentLink> SObjectType;
	public static SObjectFields$<ContentDocumentLink> Fields;

	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id Id;
	public Boolean IsDeleted;
	public Id LinkedEntityId;
	public Name LinkedEntity;
	public String ShareType;
	public Datetime SystemModstamp;
	public String Visibility;

	public ContentDocumentLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
