/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailBounceEvent extends SObject {
	public static SObjectType$<EmailBounceEvent> SObjectType;
	public static SObjectFields$<EmailBounceEvent> Fields;

	public Datetime BounceDate;
	public String BouncedAddress;
	public Id BouncedObjectId;
	public Name BouncedObject;
	public String Classification;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorMessage;
	public String EventUuid;
	public String ReplayId;
	public String SenderAddress;
	public Boolean ShouldGenerateDsn;

	public EmailBounceEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailBounceEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailBounceEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailBounceEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailBounceEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
