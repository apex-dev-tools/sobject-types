/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WebCartCollaboratorChangeEvent extends SObject {
	public static SObjectType$<WebCartCollaboratorChangeEvent> SObjectType;
	public static SObjectFields$<WebCartCollaboratorChangeEvent> Fields;

	public String AccessLevel;
	public Object ChangeEventHeader;
	public Id CollaboratorId;
	public User Collaborator;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public Id SharedById;
	public User SharedBy;
	public Datetime SharedDate;
	public Id WebCartId;
	public WebCart WebCart;

	public WebCartCollaboratorChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartCollaboratorChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartCollaboratorChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartCollaboratorChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartCollaboratorChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
