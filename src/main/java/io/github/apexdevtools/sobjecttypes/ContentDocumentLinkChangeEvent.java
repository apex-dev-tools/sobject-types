/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ContentDocumentLinkChangeEvent extends SObject {
	public static SObjectType$<ContentDocumentLinkChangeEvent> SObjectType;
	public static SObjectFields$<ContentDocumentLinkChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ContentDocumentId;
	public ContentDocument ContentDocument;
	public Id Id;
	public Id LinkedEntityId;
	public SObject LinkedEntity;
	public String ReplayId;
	public String ShareType;
	public String Visibility;

	public ContentDocumentLinkChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContentDocumentLinkChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
