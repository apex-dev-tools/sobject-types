/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class UriEvent extends SObject {
	public static SObjectType$<UriEvent> SObjectType;
	public static SObjectFields$<UriEvent> Fields;

	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public String LoginKey;
	public String Message;
	public String Name;
	public String Operation;
	public String OperationStatus;
	public String QueriedEntities;
	public Id RecordId;
	public SObject Record;
	public String RelatedEventIdentifier;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public UriEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
