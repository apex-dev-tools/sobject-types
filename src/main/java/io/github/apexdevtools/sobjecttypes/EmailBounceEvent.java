/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
