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
public class ManagedContent extends SObject {
	public static SObjectType$<ManagedContent> SObjectType;
	public static SObjectFields$<ManagedContent> Fields;

	public String ApiName;
	public Id AuthoredManagedContentSpaceId;
	public ManagedContentSpace AuthoredManagedContentSpace;
	public String ContentKey;
	public String ContentTypeFullyQualifiedName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalId;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String PrimaryLanguage;
	public Datetime SystemModstamp;

	public AbnExperiment[] AbnExperiments;
	public ManagedContentVariant[] ManagedContentVariants;
	public PersonalizationPoint[] PersonalizationPoints;

	public ManagedContent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ManagedContent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
